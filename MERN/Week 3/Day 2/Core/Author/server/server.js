const express = require("express")
const cors = require("cors")
const app = express()
 
//grab the connfig
require("dotenv").config()

const PORT = process.env.PORT

//grab the configs
require("./config/mongoose.config")

//MIDDLEWARE
app.use(express.json(),express.urlencoded({extended: true}),cors());

//grab the routes
require('./routes/author.route')(app);

app.listen(PORT, () => {
 console.log(`Connecting to our server with succes to this PORT: ${PORT}✅✅`)
})