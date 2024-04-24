const express = require("express")
const app = express()

require("dotenv").config()

const PORT = process.env.PORT



require("./config/config.mongoose")


app.listen(PORT, () => {
 console.log(`Connectin to our server with succes to this PORT: ${PORT}✅✅`)
})