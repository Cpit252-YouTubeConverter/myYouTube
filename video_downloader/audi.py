from pytube import YouTube
from moviepy.editor import *

def download_audio(url, output_path):
    yt = YouTube(url)
    audio_streams = yt.streams.filter(only_audio=True)
    audio_stream = audio_streams.first()
    audio_file_path = audio_stream.download(output_path)

    audio_clip = AudioFileClip(audio_file_path)
    final_audio_file_path = audio_file_path.replace(".webm", ".mp3")
    audio_clip.write_audiofile(final_audio_file_path)

if __name__ == "__main__":
    import sys
    url = sys.argv[1]
    output_path = sys.argv[2]
    download_audio(url, output_path)