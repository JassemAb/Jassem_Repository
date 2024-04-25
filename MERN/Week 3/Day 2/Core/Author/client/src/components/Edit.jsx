import React, {useEffect, useState} from 'react'
import axios from 'axios'
import {useNavigate, useParams, Link} from 'react-router-dom'
import style from "../style/edit.module.css"

const Edit = () => {
 const nav = useNavigate()
 const {id} = useParams ()

 const [name, setName] = useState("")
 const [errors, setErrors] = useState([])

 useEffect(() => {
  axios.get("http://localhost:8000/api/Author/" + id)
  .then(res=>{
   setName(res.data.name)
  })
  .catch(err=>console.error(err))
 }, [id])

 const submitHandler = (e) => {
  e.preventDefault()
  axios.put("http://localhost:8000/api/Author/edit/"+id, {name})
  .then(res=>nav("/"))
  .catch(err=>{
   console.log(err)
   const errorResponse = err.response.data.errors
   const errorArr = []
   for (const key of Object.keys(errorResponse)) {
    errorArr.push(errorResponse[key].message)
   }
   setErrors(errorArr)
  })
 }
  return (
    <div>
     <form onSubmit={(e)=>submitHandler(e)}>
    <h1 className={style.edit1}>Edit Author:</h1>
    <Link className={style.link} to={"/"}>Home</Link>
    <h4 className={style.edit}>Edit this Author</h4>
    <div>
     <label htmlFor="" className={style.name}>Name:</label>
     <input type="text" value={name} onChange={(e)=>setName(e.target.value)}/>
    </div>
    <div>
     {errors.map((err, i)=> <p key={i}>{err}</p>)}
    </div>
    <div>
     <button className={style.btn}>Submit</button>
    </div>
   </form>
    </div>
    
  )
}

export default Edit