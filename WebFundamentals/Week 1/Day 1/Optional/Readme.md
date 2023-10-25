Coding Dojo Repository
<!DOCTYPE html> <html lang="en"> <head>     <meta charset="UTF-8">     <meta name="viewport" content="width=device-width, initial-scale=1.0">     <link rel="stylesheet" href="flag1.css">     <title>Document</title> </head> <body>    <div id="black" class="div">   .    </div>    <div id="yellow" class="div">     .      </div>      <div id="red" class="div">         .          </div> </body> </html>
#black{
    background-color: black;
    width: 100px;
        height: 300px;
}
#yellow{
    background-color:yellow;
    width: 100px;
        height: 300px;
        margin-left: -10px;
}
#red{
    background-color:rgb(255, 0, 0);
    width: 100px;
        height: 300px;
        margin-left: -10px;
}
.div {
    display: inline-block;
  }