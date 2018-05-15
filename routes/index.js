var express = require('express');
var router = express.Router();
var  request = require('request');

var apiKey = '2d27b64b6fa9e6dad465a897c83c1c1a';


var app = express();
/* GET home page. */
router.get('/', function(req, res, next) {
  res.render('index');
});
router.post('/', function (req, res, next) {
    var city = req.body.city;
    //var citi =${city}
     var url = 'http://api.openweathermap.org/data/2.5/weather?q='+city+'&units=imperial&appid='+apiKey
    request(url, function (err, response, body) {
        if(err){
            res.render('index', {weather: null, error: 'Error, please try again'});
        } else {
            var weather = JSON.parse(body)
            if(weather.main == undefined){
                res.render('index', {weather: null, error: 'Error, please try again'});
            } else {
                var weatherText =  "It's" +weather.main.temp+ "degrees in" +weather.name;
                res.render('index', {weather: weatherText, error: null});
            }
        }
    });
});


module.exports = router;
