import './App.css';
import {Routes , Route} from 'react-router-dom'
import Dashboard from './components/Dashboard';
import New from './components/New';
import Edit from './components/Edit';

function App() {
  return (
    <Routes>
      <Route path='/' element={<Dashboard/>}/>
      <Route path='/Author/create' element={<New/>}/>
      <Route path='/authors/:id/edit' element={<Edit/>}/>
    </Routes>
  );
}

export default App;
