package com.stal111.forbidden_arcanus.block.tree;

import java.util.Random;

import com.stal111.forbidden_arcanus.world.gen.feature.MysterywoodTreeFeature;

import net.minecraft.block.trees.AbstractTree;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

public class MysterywoodTree extends AbstractTree {

	@Override
	protected AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
		return new MysterywoodTreeFeature(true);
	}

}
