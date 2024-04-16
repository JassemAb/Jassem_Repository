import { useState } from "react";

const Hook = () => {
  const [profile, setProfile] = useState([
    {
      first_name: "",
      last_name: "",
      email: "",
      password: "",
      confirm_password: "",
    },
  ]);
  const [first_name, setFirstName] = useState("");
  const [last_name, setLastName] = useState("");
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const [confirmpassword, setConfirmPassword] = useState("");

  const hhh = (e) => {
    e.preventDefault();
    setProfile([
      ...profile,
      first_name,
      last_name,
      email,
      password,
      confirmpassword,
    ]);
    setFirstName("");
    setLastName("");
    setPassword("");
    setConfirmPassword("");
    setEmail("");
  };

  return (
    <fieldset>
      <form onSubmit={SubmitEvent}>
        <label htmlFor="">First Name:</label>

        <input type="text" onChange={(e) => setFirstName(e.target.value)} />

        <label>Last Name:</label>

        <input type="text" onChange={(e) => setLastName(e.target.value)} />
        <label> Email</label>
        <input type="email" onChange={(e) => setEmail(e.target.value)} />
        <label>Password</label>
        <input type="password" onChange={(e) => setPassword(e.target.value)} />
        <label>Confirm password</label>
        <input type="password" onChange={(e) => setConfirmPassword(e.target.value)}/>
        <p>First Name : {first_name}</p>
        <p>last Name : {last_name}</p>
        <p>Email : {email}</p>
        <p>Password : {password !== "" ? "password" : ""}</p>
        <p>
          Password :{" "}
          {confirmpassword === password ? "matching password" : "wrong matching"}
        </p>
      </form>
    </fieldset>
  );
};

export default Hook;
