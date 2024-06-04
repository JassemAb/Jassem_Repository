import { useState } from "react";

function First(props) {
 return (
 <fieldset>
 <table>
   <thead>
    <tr>
     <th>First Name :</th>
     <th>Last Name :</th>
     <th>Age :</th>
     <th>Hair Color :</th>
    </tr>
   </thead>
   </table>
   
 {props.user.map((element, index) => {
 return (
  <tbody>
   <tr key={index}>
    <td>{element.firstName}</td>
    <td>{element.last_name}</td>
    <td>{element.age_name}</td>
    <td>{element.hair_color}</td>
   </tr>
  </tbody>
 
  </fieldset>
 }))}

export default First