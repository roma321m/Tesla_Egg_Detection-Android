package roman.game.teslaeggdetection;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;


public class Adapter_Score extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    public interface ScoreItemClickListener {
        void locationClicked(Score score);
    }

    private Activity activity;
    private ArrayList<Score> scores;
    private ScoreItemClickListener scoreItemClickListener;

    public Adapter_Score(Activity activity, ArrayList<Score> scores) {
        this.activity = activity;
        this.scores = scores;
    }

    public void setScoreItemClickListener(ScoreItemClickListener scoreItemClickListener) {
        this.scoreItemClickListener = scoreItemClickListener;
    }

    @Override
    public RecyclerView.ViewHolder
    onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_score, viewGroup, false);
        return new ScoreViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {

    }

    @Override
    public int getItemCount() {
        if (scores == null) return 0;
        return scores.size();
    }

    public class ScoreViewHolder extends RecyclerView.ViewHolder {
        public AppCompatImageView score_IMG_location;

        public ScoreViewHolder(final View itemView) {
            super(itemView);
            this.score_IMG_location = itemView.findViewById(R.id.score_IMG_location);

            score_IMG_location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // need to zoom into the location on the map
                    if (scoreItemClickListener != null){
                        //scoreItemClickListener.locationClicked(getItem());
                    }
                }
            });
        }
    }
}

