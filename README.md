# HorusTask
In this readme I explain step by step how I resolve this task.
My task is analize and implements methods findBlockByColor, findBlocksByMaterial, count inside Wall class without multiply the same code and use whole logic in class Wall. 
Include interface CompositeBlock
interface Structure {
// return any element by color from block list
Optional<Block> findBlockByColor(String color);

// return every element by material from block list
List<Block> findBlocksByMaterial(String material);

//return every element in block list
int count();
}

public class Wall implements Structure {
private List<Block> blocks;
}

interface Block {
String getColor();
String getMaterial();
}

interface CompositeBlock extends Block {
List<Block> getBlocks();
}
-First of all I create new project and include require code;
-Create NormalBlock class and implement interface Block to overwrite methods getMaterial and getColor;
-Create ComplexBlock class and implement interface CompositeBlock;
-Create NormalBlock field inside Complexblock class to transfer object NormalBlock by composition;
-Implement method getBlock(); which return a list of box;
-Implement method from Structure interface inside Wall class;
-Create unit tests for testing methods in Wall class;
