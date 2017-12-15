package dev.animaluprising.GameModel;

import java.awt.Graphics;
import java.awt.Rectangle;

import dev.animaluprising.GameControl.ImageManager;

public class HealSkill extends Soldier implements Ally 
{
	private int numOfTicks = 0;
	public HealSkill(float posX, float posY, int width, int height) {
		super(posX, posY, width, height);

	}

	//Update
			@Override
			public void update() {
				if(game.getCollisionManager().helpfullSkillCollision(this, game.getObjectManager().getAllies()))
				{
					Ally.super.stand(this);
					numOfTicks++;
				}
				else
				{
					numOfTicks++;
					setSpeed(4.0f);
					setHeight(100);
					setWidth(300);
					super.update();
					
				}	
				if(numOfTicks == 50)
				{
					this.remove();
				}
			}
			@Override
			public void render(Graphics g) {
				if(numOfTicks < 5 )
				{
					g.drawImage(ImageManager.healSkillImages[0], (int)posX, (int)posY-50, width,height+50, null);
				
				}
				else if(numOfTicks > 5 && numOfTicks < 10 )
				{
					g.drawImage(ImageManager.healSkillImages[1], (int)posX, (int)posY-50, width,height+50, null);
				
				}
				else if(numOfTicks > 10 && numOfTicks < 15 )
				{
					g.drawImage(ImageManager.healSkillImages[2], (int)posX, (int)posY-50, width,height+50, null);
				
				}
				else if(numOfTicks > 15 && numOfTicks < 20 )
				{
					g.drawImage(ImageManager.healSkillImages[3], (int)posX, (int)posY-50, width,height+50, null);
				
				}
				else if(numOfTicks > 20 && numOfTicks < 30 )
				{
					g.drawImage(ImageManager.healSkillImages[4], (int)posX, (int)posY-50, width,height+50, null);
				
				}
				else if(numOfTicks > 30 && numOfTicks < 35 )
				{
					g.drawImage(ImageManager.healSkillImages[3], (int)posX, (int)posY-50, width,height+50, null);
				
				}
				else if(numOfTicks > 35 && numOfTicks < 40 )
				{
					g.drawImage(ImageManager.healSkillImages[2], (int)posX, (int)posY-50, width,height+50, null);
				
				}
				else if(numOfTicks > 40 && numOfTicks < 45 )
				{
					g.drawImage(ImageManager.healSkillImages[1], (int)posX, (int)posY-50, width,height+50, null);
				
				}
				else if(numOfTicks > 45 && numOfTicks < 50 )
				{
					g.drawImage(ImageManager.healSkillImages[0], (int)posX, (int)posY-50, width,height+50, null);
				
				}
				
				
			}


		public Rectangle getCollisionRectangle() 
		{
			return new Rectangle((int)posX-20, (int)posY, width+40, height);
		}

		@Override
		public boolean isAlive() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean updateHealth(int amount) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void renderDead(Graphics g) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean updateSpeed(float amount) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean decreaseSpeed() {
			// TODO Auto-generated method stub
			return false;
		}

	
}
