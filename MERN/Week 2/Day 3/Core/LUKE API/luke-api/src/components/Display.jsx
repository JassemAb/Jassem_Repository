import React from 'react'
import { useParams } from 'react-router-dom'

const Display = (props) => {
 const {planet, id} = useParams()
 const {data} = props;
  return (
   <div>
     <h1>Search For</h1>
     <select name="planet" id="planet" value={planet}>
     <option value="people">People</option>
     <option value="planets">Planets</option>
     <option value="starships">Starships</option>
     </select>
     <h1>Id :</h1>
     <input type="text" value={id} />
      <button>Search</button>
    
    {data != null ? (planet == "people") ? (<h1>Name : {data.name}
      , Height : {data.height}
      ,Hair Color : {data.hair_color}, Mass :{data.mass},Skin Color : {data.skin_color}
    </h1>) : ("") : ""}

  {/* this for planets planets  */}
  {data != null ? (planet == "planets") ? (<h1>Name {data.name} 
  , Climate : {data.climate} ,
  Terrain : {data.terrain},
  Surface Water : {data.surface_water},
  Population : {data.population} 
  </h1>) : ("") : ""}
  {/* this for starships */}
  {data != null ? (planet == "starships") ? (<h1>Name : {data.name} 
  , Model : {data.model} ,
  Passenger : {data.passengers} </h1>) : ("") : ""}
 </div>
  )
}

export default Display