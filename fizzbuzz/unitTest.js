function fizzbuzz(n){
    let toreturn="";
    if(n%3==0||n.toString().includes('3')) toreturn+="Fizz"
    if(n%5==0||n.toString().includes('5')) toreturn+="Buzz"
    if(toreturn=="") toreturn=n
    return toreturn
}

QUnit.module('fizzbuzz', function() {
    QUnit.test('fizzbuzz', function(assert){
        assert.equal(fizzbuzz(1), "1", "1 should return 1");
        assert.equal(fizzbuzz(2), "2", "2 should return 2");
        assert.equal(fizzbuzz(3), "Fizz", "3 should return Fizz");
        assert.equal(fizzbuzz(4), "4", "4 should return 4");
        assert.equal(fizzbuzz(5), "Buzz", "5 should return Buzz");
        assert.equal(fizzbuzz(6), "Fizz", "6 should return Fizz");
        assert.equal(fizzbuzz(7), "7", "7 should return 7");
        assert.equal(fizzbuzz(8), "8", "8 should return 8");
        assert.equal(fizzbuzz(15), "FizzBuzz", "15 should return FizzBuzz");
        assert.equal(fizzbuzz(30), "FizzBuzz", "30 should return FizzBuzz");
        assert.equal(fizzbuzz(10), "Buzz", "10 should return Buzz");
        assert.equal(fizzbuzz(352), "FizzBuzz", "352 should return FizzBuzz");
    });
});