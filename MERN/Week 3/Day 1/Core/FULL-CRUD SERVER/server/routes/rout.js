const {FindAllJokes,createJoke,getOne,update,delet} = require('../controllers/jokes')

module.exports = (app)=>{
    // this for the creation for the joke
    app.post('/api/new',createJoke);
    // this for the show all Jokes
    app.get('/api/jokes',FindAllJokes);
    // this for the show the id by his id 
    app.get('/api/jokes/:id',getOne);
    // this for the update by his id
    app.patch('/api/jokes/:id',update);
    // this for the delete for the id
    app.delete('/api/jokes/:id',delet);
}