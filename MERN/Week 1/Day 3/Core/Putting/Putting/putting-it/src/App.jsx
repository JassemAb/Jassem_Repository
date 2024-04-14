import { useState } from "react";
import './App.css'
import User from './components/User'

function App(){
 const user = [{"First_Name":"Doe","Last_Name":"Jane","Age":"45","Hair_Color":"Black"},{"First_Name":"Smith","Last_Name":"Jhon","Age":"88","Hair_Color":"Brown"}]
 return (
  <div className="putting">
   <User user = {user}/>
  </div>

 )
}

export default App