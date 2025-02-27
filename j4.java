// Function to calculate electric current (I)
function calculateCurrent() {
    var charge = document.getElementById('charge').value;
    var time = document.getElementById('time').value;
    var current = charge / time;
    document.getElementById('output').innerText = "Current (I) = " + current + " Amperes";
}

// Function to calculate voltage (V)
function calculateVoltage() {
    var current = document.getElementById('current-input').value;
    var resistance = document.getElementById('resistance').value;
    var voltage = current * resistance;
    document.getElementById('output').innerText = "Voltage (V) = " + voltage + " Volts";
}

// Function to calculate power (P)
function calculatePower() {
    var voltage = document.getElementById('voltage-input').value;
    var current = document.getElementById('current-input-power').value;
    var power = voltage * current;
    document.getElementById('output').innerText = "Power (P) = " + power + " Watts";
}

// Function to calculate work (W)
function calculateWork() {
    var power = document.getElementById('power-input').value;
    var time = document.getElementById('time-input').value;
    var work = power * time;
    document.getElementById('output').innerText = "Work (W) = " + work + " Joules";
}
