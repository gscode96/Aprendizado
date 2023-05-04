import 'dart:convert';
import 'dart:html';

import 'package:flutter/material.dart';
import 'package:http/http.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatefulWidget {
  const MyApp({super.key});

  @override
  State<MyApp> createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  final formKey = GlobalKey<FormState>();
  final txtCurrence = TextEditingController();
  dynamic result = 'xxx';
  dynamic result2 = 'xxx';
  double currence = 0;
  double dollar = 0;
  double euro = 0;

  searchCurrence() async {
    final String urlViaHbg =
        'https://api.hgbrasil.com/finance?format=json-cors&key=a23a338f';
    Response respost = await get(Uri.parse(urlViaHbg));
    Map address = jsonDecode(respost.body);
    print(respost.body);

    dollar = address['results']['currencies']['USD']['buy'];
    euro = address['results']['currencies']['EUR']['buy'];

    setState(() {
      result = double.parse(txtCurrence.text) / dollar;
      result2 = double.parse(txtCurrence.text) / euro;
    });
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        appBar: AppBar(
          title: const Text('Conversor de moeda'),
        ),
        body: Padding(
          padding: const EdgeInsets.all(30.0),
          child: Column(
            key: formKey,
            children: [
              Row(
                children: [
                  Expanded(
                    child: TextFormField(
                      decoration: const InputDecoration(
                          labelText: 'Valor',
                          border: OutlineInputBorder(
                              borderRadius:
                                  BorderRadius.all(Radius.circular(30)))),
                      controller: txtCurrence,
                      validator: (value) {
                        if (value!.isEmpty) {
                          return 'Digite o valor';
                        }
                      },
                    ),
                  ),
                  Expanded(
                      child: IconButton(
                          onPressed: searchCurrence,
                          icon: const Icon(Icons.arrow_forward_rounded)))
                ],
              ),
              Row(
                children: [
                  const SizedBox(
                    height: 50,
                  ),
                  const Expanded(flex: 1, child: Text('Valor Dólar')),
                  const SizedBox(
                    height: 50,
                  ),
                  Expanded(flex: 3, child: Text('$result')),
                  const SizedBox(
                    height: 50,
                  ),
                ],
              ),
              Row(
                children: [
                  const SizedBox(
                    height: 50,
                  ),
                  const Expanded(flex: 1, child: Text('Valor Euro')),
                  const SizedBox(
                    height: 50,
                  ),
                  Expanded(flex: 3, child: Text('$result2')),
                  const SizedBox(
                    height: 50,
                  ),
                ],
              ),
            ],
          ),
        ),
      ),
    );
  }
}
