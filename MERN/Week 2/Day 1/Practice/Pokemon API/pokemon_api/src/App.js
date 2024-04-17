import logo from './logo.svg';
import './App.css';
import React, { useState,useEffect } from 'react'

function App() {

  const [Pokemons,setPokemons] = useState([])

  const FetchPokemon = () => {
    fetch("https://pokeapi.co/api/v2/pokemon/ditto")
    .then(response => {
      return response.json()
    }).then((JsonResponse) => {
      console.log(JsonResponse)
      setPokemons(JsonResponse)
    })
    .catch(err => {
      console.log(err)
    })
  }

  return (
    <div className="App">
     <h1>😎Pokemon API😎</h1>
     {/* {JSON.stringify(Pokemons)} */}
     <p></p>
      <button onClick={(FetchPokemon, setPokemons)}>Fetch Pokemon</button>
      <hr />
     <table>
      <thead>
        <tr>
          <th>Name</th>     
        </tr>
      </thead>
      <tbody>
        {
          Pokemons.map((pokemon) => {
            return(
              <tr>
                <td>{pokemon.name}</td>
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
