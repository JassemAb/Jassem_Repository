import { useState } from "react";


const More = (props) => {
 const [profile, setProfile] = useState ([{
  first_name: "" ,last_name: "" ,email: "" ,password: "" ,confirm_password: ""
 }])
 const [first_name, setFirstName] = useState ("")
 const [last_name, setLastName] = useState ("")
 const [email, setEmail] = useState ("")
 const [password, setPassword] = useState ("")
 const [confirm_password, setConfirm_Password] = useState ("")


 const valide = (e)=>{
  e.preventDefault();
  setProfile([
   first_name,
   last_name,
   email,
   password,
   confirm_password,
  ]);
  setProfile([...profile,first_name,last_name,email,password,confirm_password])
  setFirstName("");
  setLastName("");
  setEmail("");
  setPassword("");
  setConfirm_Password("");
 };

 return(
  <fieldset>
   <form onSubmit={SubmitEvent}>
    <label>First Name:</label>
    <input type="text" onChange={(e) => setFirstName(e.target.value)}/>
    <h5>{first_name.length==0?"":
        first_name.length<3? "First name must be at least 2 characters":''}</h5>
    <br />
    <label>Last Name:</label>
    <input type="text" onChange={(e) => setLastName(e.target.value)}/>
    <h5>{last_name.length==0?"":
        last_name.length<3? "Last name must be at least 2 characters":''}</h5>
    <br />
    <label>Email:</label>
    <input type="text" onChange={(e) => setEmail(e.target.value)}/>
    <h5>{email.length==0?"":
        email.length<3? "Email must be at least 2 characters":''} </h5>
    <br />
    <label>Password:</label>
    <input type="password" onChange={(e) => setPassword(e.target.value)}/>
    <h5>{password.length==0?"":
        password.length<9? "Password must be at least 8 characters":''}</h5>
    <br />
    <label>Confirm Password:</label>
    <input type="password" onChange={(e) => setConfirm_Password(e.target.value)}/>
    <h5>{confirm_password.length==0?"":
        password!=confirm_password?"Password must match":''}</h5>
    <br />
   </form>
  </fieldset>
 )
}


export default More;