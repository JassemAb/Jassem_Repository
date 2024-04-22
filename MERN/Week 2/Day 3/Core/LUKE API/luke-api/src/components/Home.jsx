import React from 'react'
import { useState } from 'react'
import { useNavigate } from 'react-router-dom'
import axios from 'axios'

const Home = (props) => {
 const {setData} = props
 const navigate = useNavigate();
 const [planet, setPlanet] = useState("people");
 const [id, setId] = useState(0)
 console.log(planet)
 const api = () => {
  console.log(planet, "**", id)
  axios.get(`https://swapi.dev/api/${planet}/${id}/`)
  .then(res => {
   console.log(res.data)
   setData(res.data)
   navigate(`/${planet}/${id}`)
  })
  .catch(err => {
   console.log(err)
   navigate('/err')
  })
 }
 const handleSelectChange = (e) => {
  setPlanet(e.target.value)
 }
  return (
    <div>
     <h1>Search For</h1>
     <select name="planet" id="planet" onChange={handleSelectChange}>
      <option value="people">Poeple</option>
      <option value="planets">planets</option>
      <option value="starship">Starship</option>
     </select>
     <h1>Id:</h1>
     <input type="text" value={id} onChange={(e) => setId(e.target.value)}/>
     <button onClick={api}>Search</button>
    </div>
  )
}

export default Home