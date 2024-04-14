import React,{useState} from 'react'

const User = (props) => {
 const [count, setCount] = useState(props.user)
 const increase = (index)=>{
  console.log(index)
  console.log(props.user[index].age)
  setCount(props.user[index].age =+1);
 }
  return (
   <fieldset>
     {props.user.map((element,index) =>
     {return (
      <fieldset className='card' key = {index}>
       <h1 className='name'>{element.First_Name}, {element.Last_Name}</h1>
       <p className='name'>Age:{element.Age}</p>
       <p className='name'>Hair Color:{element.Hair_Color}</p>
       <button className='name' onClick = {()=>increase(index)}>Birthday Button for {element.Last_Name} {element.First_Name}</button>
      </fieldset>
     )})}
    </fieldset>
  )
}

export default User