fs = require('fs');
os = require('os');
process = require('process');

let data = os.homedir() + "/Desktop/Programming/Java/DoomsdayMod/bin/data/LATEST.txt"
let out = os.homedir() + "/Desktop/Programming/Java/DoomsdayMod/LATEST.txt"

data = {
        "version": process.argv[2],
        "mcVersion": "1.7.10-Forge-1614"
}

fs.writeFile(out, JSON.stringify(data), function(error) {
    if(error) console.log(error);
});


