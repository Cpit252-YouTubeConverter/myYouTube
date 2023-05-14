from pytube import YouTube
from moviepy.editor import *

def download_video_and_convert_to_audio(url, output_path):
    yt = YouTube(url)
    stream = yt.streams.filter(progressive=True, file_extension='mp4').first()
    video_file_path = stream.download(output_path)


    video_clip = VideoFileClip(video_file_path)
    audio_file_path = video_file_path.replace(".mp4", ".mp3")
    video_clip.audio.write_audiofile(audio_file_path)

if __name__ == "__main__":
    import sys
    url = sys.argv[1]
    output_path = sys.argv[2]
    download_video_and_convert_to_audio(url, output_path)
