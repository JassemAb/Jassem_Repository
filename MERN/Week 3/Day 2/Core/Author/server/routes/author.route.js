const AuthorControllers = require("../controllers/author.controller")

module.exports = (app) =>{
 app.post("/api/Author/create", AuthorControllers.create)
 app.get("/api/Author", AuthorControllers.getAll)
 app.get("/api/Author/:id", AuthorControllers.getOne)
 app.put("/api/Author/edit/:id", AuthorControllers.update)
 app.delete("/api/Author/delete/:id", AuthorControllers.delete)
}