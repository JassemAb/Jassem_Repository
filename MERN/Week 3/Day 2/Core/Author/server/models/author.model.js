const mongoose = require('mongoose')
const AuthorSchema = new mongoose.Schema({
 name : {
  type : String,
  required : [true, "{PATH} Author name must be at least 3 chars"],
  minLength : [3, "{PATH} must be at least 3 chars"]
 }
}, {timestamps: true});
module.exports.Author = mongoose.model('Author', AuthorSchema);