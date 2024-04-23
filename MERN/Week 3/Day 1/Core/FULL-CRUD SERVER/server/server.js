const express = require("express")
const app = express()
require("dotenv").config();
const port = process.env.PORT;
const PORT = 5000

app.use(express.json(), express.urlencoded({extended: true}));







app.listen(PORT, ()=> {
 console.log(`Connected to our server successfully ✅✅`)
})