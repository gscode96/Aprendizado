import 'package:flutter/material.dart';
import 'package:flutter/src/widgets/framework.dart';


class ItemComponent extends StatefulWidget {
  const ItemComponent({super.key, this.currenc, this.currencVar});
  final currenc;
  final currencVar;
 

  @override
  State<ItemComponent> createState() => _ItemComponentState();
}

class _ItemComponentState extends State<ItemComponent> {
  @override
  Widget build(BuildContext context) {
    return Column(
      children: [
    Row(
      children: [
        Padding(
          padding: const EdgeInsets.all(5),
          child: Text(
            '${widget.currenc}',
            style: const TextStyle(fontSize: 30, color: Colors.black),
          ),
        ),
        Container(
            padding: const EdgeInsets.all(2),
            color: widget.currencVar < 0 ? Colors.red : Colors.blueAccent,
            child: Text('${widget.currencVar}',
                style: const TextStyle(color: Colors.white, fontSize: 10)
                )
                ),
                
      ],
    ),

      ],
    );
  }
}
