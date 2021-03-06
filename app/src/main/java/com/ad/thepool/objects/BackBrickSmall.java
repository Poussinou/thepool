package com.ad.thepool.objects;

import com.ad.thepool.GObject;
import com.ad.thepool.TileMap;
import com.ad.thepool.components.RenderTileComponent;
import com.ad.thepool.components.TransformTileComponent;

public class BackBrickSmall extends GObject implements Cloneable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1934315371061691062L;

	public BackBrickSmall(int id, TileMap tilemap) {
		super(id, true);
		TransformTileComponent tiletransform = new TransformTileComponent('H', true, Z_BACK2);
		RenderTileComponent rendertile = new RenderTileComponent(tilemap, 8, true);
		addComponent(tiletransform);
		addComponent(rendertile);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
