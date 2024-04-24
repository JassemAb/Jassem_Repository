const { error } = require("console");
const Product = require ("../models/product.model")



module.exports.create = (req,res)=> {
 const {title, price, description} = req.body;

 if (!title , !price , !description){
  return res.status(500).json({err:"title & price & description required"});
 }

 Product.create({title,price,description})
 .then(newProd => {
  console.log("Product Has been created", newProd);
  res.status(400).json(newProd);
 }).catch(err => {
  console.log(err);
  res.status(300).json({err:'Error'});
 })
}