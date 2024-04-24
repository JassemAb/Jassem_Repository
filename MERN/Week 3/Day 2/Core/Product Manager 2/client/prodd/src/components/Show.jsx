import React, { useEffect, useState } from 'react'
import Form from '../components/Form';
import ProductList from '../components/ProductList';
import axios from 'axios';
const Main = (props) => {
    const [res,setRes] = useState([]);
    const [loaded,setLoaded] = useState(false);
    console.log(res);
    useEffect(() => {
        axios.get('http://localhost:8001/api/products')
            .then(res => {
                setRes(res.data);
                setLoaded(true);
            })
            .catch(err => console.error(err));
    }, []);

    return (
        <div>
            <Form setProduct={props.setProduct}/>
            <hr />
            <h1>All Products</h1>
            {loaded && res.map((element,idx)=>(
                console.log(element),
                console.log(element._id),
                <ProductList key={idx} prod={element} id={element._id} />
            ))}
        </div>
    )
}

export default Main;