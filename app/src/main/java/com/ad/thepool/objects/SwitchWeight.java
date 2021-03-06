package com.ad.thepool.objects;

import com.ad.thepool.GObject;
import com.ad.thepool.TileMap;
import com.ad.thepool.components.Animation;
import com.ad.thepool.components.LightComponent;
import com.ad.thepool.components.RenderTileComponent;
import com.ad.thepool.components.SwitchComponent;
import com.ad.thepool.components.TransformTileComponent;
import com.ad.thepool.components.TriggerAbleComponent;

public class SwitchWeight extends GObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6096642808060557565L;

	public SwitchWeight(int id, TileMap tilemap) {
		super(id, true);
		TransformTileComponent tiletransform = new TransformTileComponent('R', true, Z_BACK);
		RenderTileComponent rendertile = new RenderTileComponent(tilemap, 105, true); // 89
		SwitchComponent switchC = new SwitchComponent(true, SwitchComponent.SWITCH_OFF, "std", SwitchComponent.TYPE_HEAVYW, "Activate Switch", "Deactivate Switch", "Switch activated", "Switch deactivated", "");
		TriggerAbleComponent trigger = new TriggerAbleComponent(true);
		LightComponent light = new LightComponent(true, 2, -1, 0, LightComponent.MODE_NO, SwitchComponent.RED1, SwitchComponent.RED2, 4, LightComponent.MODE_SINUS);

		addComponent(light);
		addComponent(tiletransform);
		addComponent(rendertile);
		addComponent(switchC); // after render
		addComponent(trigger);

		Animation animOn = new Animation(105, 105, 0, Animation.TYPE_STILL, true);
		Animation animOff = new Animation(106, 106, 0, Animation.TYPE_STILL, true);

		rendertile.getAnimationList().put("on", animOn);
		rendertile.getAnimationList().put("off", animOff);

		rendertile.setActiveAnimation("off", true);

	}

}
