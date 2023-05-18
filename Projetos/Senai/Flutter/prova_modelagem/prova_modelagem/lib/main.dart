import 'package:flutter/material.dart';
import 'package:prova_modelagem/views/view_bitcoin.dart';
import 'package:prova_modelagem/views/view_coin.dart';
import 'package:prova_modelagem/views/view_stock.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatefulWidget {
  const MyApp({super.key});

  @override
  State<MyApp> createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      initialRoute: '/ViewCoin',
      routes: {
        '/ViewCoin': (context) => ViewCoin(),
        '/ViewStock': (context) => ViewStock(),
        '/ViewBitcoin': (context) => ViewBitCoin(),
      },
    );
  }
}
