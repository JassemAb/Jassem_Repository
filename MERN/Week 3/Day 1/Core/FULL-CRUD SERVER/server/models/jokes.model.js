const mongoose = require("mongoose")


const JokeSchema = new mongoose.Schema({
 setup : {
  type:String,
  required:[true," {PATH} Must not be empty"],
  minlength:[10,"{PATH} MUST BE AT LEAST 10 STRING LONG"]
 },
 punchline : {
  type:String,
  required:[true,"{PATH} MUSTN T BE EMPTY"],
  minlength:[3,"{PATH} Must be at least 3 characters long "]
}
},{timestamps:true});

const Joke = mongoose.model('Movie',Jokes)

module.exports = Joke;