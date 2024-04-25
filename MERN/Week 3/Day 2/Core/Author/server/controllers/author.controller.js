const { request, response } = require("express");
const {Author} = require ("../models/author.model")

// create Author
module.exports.create = (request, response) => {
 Author.create(request.body)
     .then(object => response.json(object))
     .catch(err => response.status(400).json(err));
}

//get all Authors
module.exports.getAll = (request, response) => {
 Author.find({})
 .then(object => response.json(object))
 .catch(err => response.status(400).json(err));
}

//get one Author
module.exports.getOne = (request, response) => {
 Author.findOne({_id:request.params.id})
 .then(object => response.json(object))
 .catch(err => response.status(400).json(err));
}

//UPDATE
module.exports.update = (request, response) => {
 Author.findOneAndUpdate({_id:request.params.id},request.body, {new:true,runValidators:true})
 .then(object => response.json(object))
 .catch(err => response.status(400).json(err));
}

//DELETE
module.exports.delete = (request, response) => {
 Author.deleteOne({_id:request.params.id})
 .then(object => response.json(object))
 .catch(err => response.status(400).json(err));
}