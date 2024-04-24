import { useState } from 'react'
import {Routes,Link,Route, Navigate} from 'react-router-dom'
import './App.css'
import Form from './components/Form'
import Main from './components/display'
import Find from './components/Find'

function App() {
  const [product, setProduct] = useState([])
  return (
    <>
      <Routes>
        <Route path='/' element={<Navigate to="/product"/>}/>
        <Route path="/product" element={<Form setProduct={setProduct}/>}/>
        <Route path="/product/all" element={<Main product={product} setProduct={setProduct}/>}/>
        <Route path="/products/:id" element={<Find />}/>
      </Routes>
    </>
  )
}

export default App