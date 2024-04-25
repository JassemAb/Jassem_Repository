import React from 'react'
import axios from 'axios'
import { Link, useNavigate } from 'react-router-dom'
import { useState} from 'react'
import style from "../style/new.module.css"

const New = (props) => {
 const [data, setData] = useState([])
 const nav = useNavigate()
 const [errors , setErrors] = useState([])
 const submitHandler = (e) => {
  e.preventDefault()
  axios.post("http://localhost:8000/api/Author/create", data)
  .then(res=>{
   console.log(res.data)
   nav('/')
  })
  .catch(err=>{
   console.log(err);
   const errorResponse = err.response.data.errors;
   console.log(errorResponse, "Error")
   const errorArr = [];
   for (const key of Object.keys(errorResponse)){
    errorArr.push(errorResponse[key].message)
   }
   setErrors(errorArr);
  })
 }




 return (
    <div>
     <h1 className={style.fav}>Favorite Authors</h1>
     <Link className={style.home} to="/">Home</Link>
     <fieldset>
      {errors.map((err, index)=> <p key= {index}>{err}</p>)}
      <form onSubmit={(e)=>submitHandler(e)}>
       <label className={style.name}>Name</label>
       <input type="text" name='name' value={data.name} onChange={(e)=> setData({...data, name: e.target.value})}/>
       <button className={style.btn} type='reset'>Cancel</button>
       <br />
       <button className={style.btn1} type='submit'>Submit</button>
      </form>
     </fieldset>
    </div>
  )
 }

export default New