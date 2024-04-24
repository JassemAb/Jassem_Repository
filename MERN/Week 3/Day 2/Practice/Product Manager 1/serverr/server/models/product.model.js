// Import Mongoose
const mongoose = require("mongoose")
const { type } = require("os")

// Module - the rules need to follow

const ProductSchema = new mongoose.Schema({
 title : {
  type: String,
  required : [true,"{PATH} is required"],
  minLength: [3,"{PATH} must have at least 3 chars"]
 },
 price: {
  type: Number,
  required: [true, "{PATH} You have to put a price"],
  minLength: [1, "{PATH} You have to put a price" ]
 },
 description: {
  type: String,
  required: [true, "{PATH} Description must be added"],
  minLength: [1, "{PATH} Fill this field please"]
 }
},{timestamps:true})

const Product = mongoose.model("Product", ProductSchema)
module.exports = Product