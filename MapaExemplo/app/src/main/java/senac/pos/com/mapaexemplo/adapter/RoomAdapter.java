package senac.pos.com.mapaexemplo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import senac.pos.com.mapaexemplo.R;
import senac.pos.com.mapaexemplo.custom.ClickRecyclerView;
import senac.pos.com.mapaexemplo.model.Room;

/**
 * Created by iossenac on 12/08/17.
 */

public class RoomAdapter extends RecyclerView.Adapter<RoomAdapter.RecyclerRoomViewHolder> {
    Context context;
    private List<Room> rooms;
    public ClickRecyclerView clickRecyclerViewInterface;

    public RoomAdapter(Context context, List<Room> rooms, ClickRecyclerView clickRecyclerViewInterface) {
        this.context = context;
        this.rooms = rooms;
        this.clickRecyclerViewInterface = clickRecyclerViewInterface;
    }

    @Override
    public RoomAdapter.RecyclerRoomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_room, parent, false);
        return new RecyclerRoomViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RoomAdapter.RecyclerRoomViewHolder holder, int position) {
        Room pessoa = rooms.get(position);

        holder.txtName.setText(pessoa.toString());
    }

    @Override
    public int getItemCount() {
        return rooms.size();
    }

    protected class RecyclerRoomViewHolder extends RecyclerView.ViewHolder {

        protected TextView txtName;

        public RecyclerRoomViewHolder(final View itemView) {
            super(itemView);

            txtName = (TextView) itemView.findViewById(R.id.txtItemRoomName);

            //Setup the click listener
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    clickRecyclerViewInterface.onCustomClick(rooms.get(getLayoutPosition()));
                }
            });
        }
    }
}
