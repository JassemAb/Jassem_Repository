const mongoose = require("mongoose")

const dbName = process.env.DB
const username = process.env.ATLAS_USERNAME
const pw = process.env.ATLAS_PASSWORD


mongoose.connect(`mongodb+srv://${username}:${pw}@cluster0.mqbko86.mongodb.net/?retryWrites=true&w=majority&appName=${dbName}`)
   .then(()=> console.log(`Established a connection to the database ${dbName} 🛰️  🛰️`))
   .catch(err => console.log("Something went wrong with the database", err));

