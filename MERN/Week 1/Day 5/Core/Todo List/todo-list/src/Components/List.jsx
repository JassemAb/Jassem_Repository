import { useEffect, useState } from 'react';
import axios from 'axios';

function App() {
  const [countries, setCountries] = useState([])
  const [update, setUpdated] = useState(true)
  const [newName, setNewName] = useState()
  useEffect(()=>{
    axios.get(
      "https://restcountries.com/v3.1/all?fields=name,flags,independent"
    )
    .then((res)=>setCountries(res.data))
    .catch((err)=>console.log(err))
  },[])

  const updateCountry =() => {
   const newList = countries
   newList [i].independent = !newList[i].independent
   setCountries(newList)
  }
  const deleteCountry=(index)=>{
   setCountries(countries.filter((c,i)=> i!=index))
  }
  return (
    <div className="App">
     <h1>Countries List</h1>
     <form>
      <label className="label-control">Name</label>
      <input type="text" className="form-control" />
      <label className="label-control">Flag</label>
      <input type="text" className="form-control" />
      <label className="label-control">Name</label>
      <input type="text" className="form-control" />
     </form>
      <table>
        <thead>
          <tr>
            <th>Name</th>
            <th>Flag</th>
            <th>Actions</th>
          </tr>
        </thead>
        <tbody>
          {countries.map((c,i) =>
          <tr>
            <td>{c.name.common}</td>
            <td><img src={c.flags.png} alt="" height={150} /></td>
            <td><input type="checkbox" 
            onChange={()=> {updateCountry(i)
                            setUpdated(!update)}}
            checked = {c.independent}
            />{""}Independent
            <button onClick={()=>deleteCountry(i)}>delete</button>
            </td>
          </tr>
         )}
        </tbody>
      </table>
    </div>
  )}

  export default App;
