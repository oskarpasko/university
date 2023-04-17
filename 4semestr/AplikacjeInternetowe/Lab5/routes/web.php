<?php

use App\Http\Controllers\TemperatureController;
use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider and all of them will
| be assigned to the "web" middleware group. Make something great!
|
*/

Route::get('/', function () {
    return view('welcome');
});

Route::get('/greetings/jan', function () {
    return view('hello');
});

Route::get('/xd/{cos?}', function (string $cos = 'uknown') {
    return "<h1>Hello World ".$cos."</h1>";
});

Route::get('/ctf/{c?}', [TemperatureController::class, 'ctf']);
