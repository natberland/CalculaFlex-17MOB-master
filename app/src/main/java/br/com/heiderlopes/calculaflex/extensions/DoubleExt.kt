package br.com.heiderlopes.calculaflex.extensions

fun Double.format(digits: Int) = String.format("%.${digits}f", this)