package com.syntrax.units.tracks;

import com.syntrax.units.Unit;
import com.syntrax.units.nodes.NoneNode;

import java.util.ArrayList;

public abstract class ComplexTrack extends Track {
  public ComplexTrack(ArrayList<Unit> units) {
    super(units);

    for (int i = 0; i < units.size(); i++) {
      if (!(units.get(i) instanceof Track)) {
        units.set(i, new Line(units.get(i)));
      }
    }
  }
}
