const {createProduct} = require('../controllers/create')


module.exports = (app)=>{
//Creation of the product
    app.post('/api/new',createProduct);
}