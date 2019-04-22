public interface Collidable<Block>
	{
   boolean didCollideLeft(Block obj);  
         boolean didCollideRight(Block obj);  
   boolean didCollideTop(Block obj);  
   	   boolean didCollideBottom(Block obj);  
      }
