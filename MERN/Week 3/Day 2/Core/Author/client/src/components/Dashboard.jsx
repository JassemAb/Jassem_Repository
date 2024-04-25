import React, {useState, useEffect} from 'react'
import axios from 'axios'
import { useNavigate, Link } from 'react-router-dom'
import style from "../../src/style/daschboard.module.css"


function Dashboard() {
 const navigate = useNavigate()
 const [authors, setAuthors] = useState([])
 useEffect(()=> {
  axios.get("http://localhost:8000/api/Author")
  .then(res=> setAuthors(res.data))
  .catch(err=>console.log(err))
 }, [])

 const deleteC = (id) => {
  axios.delete(`http://localhost:8000/api/Author/delete/`+id)
  .then(response => {
    console.log(response);
    setAuthors(authors.filter(author => author._id !== id));
  })}

   const edited = (_id) => {
    navigate(`/authors/${_id}/edit`);
  }

  return (
    <div>
     <h1 className={style.jj}>Favorite Authors</h1>
     <Link className={style.link} to="/Author/create">Add an author</Link>
     <h4 className={style.Quotes}>We Have Quotes By:</h4>
     <table className='table table-bordered border-primary'>
      <thead>
       <tr>
        <th>Authors</th>
        <th>Actions Available</th>
       </tr>
      </thead>
      <tbody>
       {authors.map((authors, idx)=> (
        <tr key={idx}>
         <td>{authors.name}</td>
         <td>
          <button onClick={()=> edited(authors._id, authors.name)}>Edit</button>
          <button onClick={()=> deleteC(authors._id)}>Delete</button>
         </td>
        </tr>
       ))}
      </tbody>
     </table>
    </div>
  )
}

export default Dashboard