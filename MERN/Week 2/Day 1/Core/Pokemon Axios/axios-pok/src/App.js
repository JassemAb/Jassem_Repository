import './App.css';
import axios from 'axios';
import { useState, useEffect } from 'react';

function App() {

  const [Pokemons, setPokemons] = useState([])



  useEffect(() => {
    axios.get("https://pokeapi.co/api/v2/pokemon/ditto")
      .then((res) => {
        console.log(res.data)
        setPokemons(res.data)
      }).catch((err) => {
        console.log(err)
      })
  }, [])



  const FetchPokemons = () => {
    fetch("https://pokeapi.co/api/v2/pokemon/ditto")
      .then(response => {
        return response.json()
      }).then((JsonResponse) => {
        console.log(JsonResponse)
        setPokemons(JsonResponse)
      })
      .catch(err => {
        console.log(err);
      })
  }

 
  const AxiosPokemons = () => {
    axios.get("https://pokeapi.co/api/v2/pokemon/ditto")
      .then((res) => {
        console.log(res.data)
        setPokemons(res.data)
      }).catch((err) => {
        console.log(err)
      })
  }



  return (
    <div className="App">
      <h1> Pokemons API 🦸</h1>
      {/* {JSON.stringify(Pokemons)} */}
      <p></p>
      <button onClick={FetchPokemons}>Fetch Pokemons</button>
      <button onClick={AxiosPokemons}>Axios Pokemons</button>
      <hr />

      <table>
        <thead>
          <tr>
            <th>name</th>
          </tr>
        </thead>
        <tbody>
          {
            Pokemons.map((Pokemons) => {
              return (
                <tr>
                  <td>{Pokemons.name}</td>
                </tr>

              )
            })
          }

        </tbody>
      </table>

    </div>
  );
}

export default App;