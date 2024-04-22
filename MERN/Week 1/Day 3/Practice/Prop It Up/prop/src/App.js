import logo from './logo.svg';
import './App.css';
import First from "./components/First"

function App() {
  const user = [{"firstName":"Doe" , "last_name":"Jane" , "age":45 , "hair_color":"Black"},
                {"firstName":"Smith" , "last_name":"Jhon" , "age":88 , "hair_color":"Browns"}]
  return (
    <div className="App">
      <First user={user} />

    </div>
  );
}

export default App;
