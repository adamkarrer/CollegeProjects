function genStat(){
  
  var rolls = [];
  var sum = 0;

  for (i = 0; i<4; i++){
   rolls.push(Math.floor(Math.random() * 6) + 1);
   }

  rolls.sort(function(a, b){return a-b});
  rolls.shift();

  for(i in rolls){
   sum += rolls[i];
  }

  return sum;

}

let Character = {
  name: null,
  level: 1,
  strength: 0,
  dexterity: 0,
  constitution: 0,
  wisdom: 0,
  intelligence: 0,
  charisma: 0,
  hitpoints: 0,
  getModifier : function(ability){
    return Math.floor((ability - 10) / 2);
  },
};

console.log(Character.getModifier(strength))