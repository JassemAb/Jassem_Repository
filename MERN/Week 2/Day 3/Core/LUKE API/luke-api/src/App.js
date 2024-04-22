import logo from './logo.svg';
import './App.css';
import { useState } from 'react';
import { Routes, Route, Link } from 'react-router-dom';

function App() {
  const [data,setData] = useState("");
  return (
   <>
   <Routes>
    <Route path='/' element={<Home setData = {data}/>}/>
    <Route path='/:planet/:id' element={<Display data = {data}/>}/>
    <Route path='/error' element = {<h1>Error</h1>}/>
   </Routes>
   </>
  );
}

export default App;
