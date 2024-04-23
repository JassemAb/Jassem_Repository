const mongoose = require("mongoose")


const dbname = process.env.DB
const username = process.env.ATLAS_USERNAME
const pw = process.env.ATLAS_USERNAME

const uri = `mongodb+srv://${username}:${pw}@YOUR_CONNECTION_STRING_HERE/${dbname}?retryWrites=true&w=majority`;

mongoose.connect(uri)
   .then(() => console.log(`Database connected🛰️ ${dbname}`))
   .catch(err => console.log("something went wrong🤒", err))