import React, { useEffect, useState } from 'react'
import axios from 'axios'
import { useParams } from 'react-router-dom'

const Find = () => {
    const {id}=useParams();
    const [data,setData] = useState("");
    useEffect(() => {
        axios.get(`http://localhost:8001/api/products/${id}`)
            .then(res => {
                setData(res.data);
            })
            .catch(err => console.error(err));
    }, []);
    return (
        <div>
            <p>The Title : {data.title}, The Price : {data.price},the Description : {data.description}</p>
        </div>
    )
}

export default Find