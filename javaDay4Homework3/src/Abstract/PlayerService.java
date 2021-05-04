package Abstract;

import Entities.Player;

public interface PlayerService {

	void Save(Player player);
	void Update(Player player);
	void Delete(Player player);
}
