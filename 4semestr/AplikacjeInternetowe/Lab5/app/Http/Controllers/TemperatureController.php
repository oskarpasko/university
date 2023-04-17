<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class TemperatureController extends Controller
{
    public function ctf(float $c = null)
    {
        if($c == null) return "Nie podano wartości";
        else return ($c * (9/5)) + 32;
    }
}
